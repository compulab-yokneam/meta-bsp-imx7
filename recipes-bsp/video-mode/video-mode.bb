DESCRIPTION = "Video Mode Select"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=e81e6ad3ed11e026669f9a5ab27f4fcd"

PR = "r1"

SRC_URI = " \
	file://video-mode \
	file://COPYING \
"

S = "${WORKDIR}"

do_install_cl-som-imx7() {
	mkdir -p ${D}/usr/local/bin/
	cp ${S}/video-mode ${D}/usr/local/bin/
}

FILES_${PN}_cl-som-imx7 = " \
	/usr/local/bin/* \
"

RDEPENDS_${PN} = "bash"
