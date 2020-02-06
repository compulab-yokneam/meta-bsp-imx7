SUMMARY = "CompuLab 4.19.35 kernel"
DESCRIPTION = "Linux kernel for CompuLab imx7 boards."

require recipes-kernel/linux/linux-imx.inc

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"
DEPENDS += "lzop-native bc-native"

SRCBRANCH = "imx_4.19.35_1.1.0"
KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/linux-imx.git;protocol=https"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"
SRCREV = "0f9917c56d5995e1dc3bde5658e2d7bc865464de"

S = "${WORKDIR}/git"

DEFAULT_PREFERENCE = "1"

LOCALVERSION = "-cl-4.0"

include compulab/imx7d.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/compulab/imx7d:"

addtask copy_defconfig after do_patch before do_preconfigure
do_copy_defconfig () {
    install -d ${B}
    mkdir -p ${B}
    cp ${S}/arch/arm/configs/compulab_imx7_defconfig ${B}/.config
    cp ${S}/arch/arm/configs/compulab_imx7_defconfig ${B}/../defconfig
}

KERNEL_MODULE_AUTOLOAD += "userspace_consumer"
KERNEL_MODULE_AUTOLOAD += "userspace_consumer_wrapper"

COMPATIBLE_MACHINE_cl-som-imx7 = "cl-som-imx7"
# EXTRA_OEMAKE_append_mx7 = " ARCH=arm"
