SUMMARY = "CompuLab 4.14.98 kernel with PREEMPT_RT patch "
DESCRIPTION = "Linux kernel with PREEMPT_RT patch for CompuLab imx7 boards."

require recipes-kernel/linux/linux-imx.inc

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

SRCBRANCH = "imx_4.14.98_2.0.0_ga"
KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/linux-imx.git;protocol=https"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"
SRCREV = "1175b59611537b0b451e0d1071b1666873a8ec32"

S = "${WORKDIR}/git"

LOCALVERSION = "-cl-3.0"

DEPENDS += "lzop-native bc-native"

DEFAULT_PREFERENCE = "1"

FILESEXTRAPATHS_prepend := "${THISDIR}/linux-compulab-${PV}/${MACHINE}:"

include linux-compulab-4.14.98/linux-compulab_cl-som-imx7.inc
include linux-compulab-4.14.98/linux-compulab-rt_cl-som-imx7.inc

COMPATIBLE_MACHINE = "cl-som-imx7"
# EXTRA_OEMAKE_append_mx7 = " ARCH=arm"
