LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://README;md5=2456088a0455a82ac9e16b007de97c03"
DEPENDS = "u-boot-mkimage-native"

DESTDIR = "/boot"
S = "${WORKDIR}"

inherit deploy

SRC_URI = "\
    file://README \
    file://bootscr \
"

IBOOTSCRIPT ?= "bootscr"
OBOOTSCRIPT ?= "boot.scr"

do_mkimage () {
    uboot-mkimage -A arm -O linux -T script -C none -a 0 -e 0 \
        -n "boot script" -d ${S}/${IBOOTSCRIPT} \
        ${S}/${OBOOTSCRIPT}
}

addtask mkimage after do_compile before do_install
do_compile[noexec] = "1"

do_deploy () {
    install -D -m 644 ${S}/${OBOOTSCRIPT} \
            ${DEPLOYDIR}/${OBOOTSCRIPT}-${MACHINE}-${PV}-${PR}

    ln -sf ${OBOOTSCRIPT}-${MACHINE}-${PV}-${PR} ${DEPLOYDIR}/${OBOOTSCRIPT}-${MACHINE}
}

addtask deploy after do_install before do_build

do_compile[noexec] = "1"

do_install () {
    install -d ${D}/${DESTDIR} 
    install -D -m 644 ${S}/boot.scr ${D}/${DESTDIR}/boot.scr
}

FILES_${PN} += "${DESTDIR}/"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "cl-som-imx7"
