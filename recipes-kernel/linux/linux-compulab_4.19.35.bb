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

COMPATIBLE_MACHINE_cl-som-imx7 = "cl-som-imx7"
# EXTRA_OEMAKE_append_mx7 = " ARCH=arm"
