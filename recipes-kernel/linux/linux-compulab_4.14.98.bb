SUMMARY = "CompuLab 4.14.98 kernel"
DESCRIPTION = "Linux kernel for CompuLab imx7 boards."

require recipes-kernel/linux/linux-imx.inc

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

SRCBRANCH = "imx_4.14.98_2.0.0_ga"
KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/linux-imx.git;protocol=https"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"
SRCREV = "5d6cbeafb80c52af322a45985aa7b41f9b9ec66c"

S = "${WORKDIR}/git"

LOCALVERSION = "-cl-3.0"

DEPENDS += "lzop-native bc-native"

DEFAULT_PREFERENCE = "1"

include linux-compulab-4.14.98/linux-compulab_cl-som-imx7.inc

addtask copy_defconfig after do_patch before do_preconfigure
do_copy_defconfig () {
    install -d ${B}
    mkdir -p ${B}
    cp ${S}/arch/arm/configs/compulab_imx7_defconfig ${B}/.config
    cp ${S}/arch/arm/configs/compulab_imx7_defconfig ${B}/../defconfig
}

COMPATIBLE_MACHINE = "cl-som-imx7"
# EXTRA_OEMAKE_append_mx7 = " ARCH=arm"
