SUMMARY = "CompuLab 4.14.98 kernel with PREEMPT_RT patch "
DESCRIPTION = "Linux kernel with PREEMPT_RT patch for CompuLab imx7 boards."

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-imx-src-${PV}.inc
LOCALVERSION = "-cl-3.0"

DEPENDS += "lzop-native bc-native"

DEFAULT_PREFERENCE = "1"

FILESEXTRAPATHS_prepend := "${THISDIR}/linux-compulab-${PV}/${MACHINE}:"

include linux-compulab-4.14.98/linux-compulab_cl-som-imx7.inc
include linux-compulab-4.14.98/linux-compulab-rt_cl-som-imx7.inc

COMPATIBLE_MACHINE = "cl-som-imx7"
# EXTRA_OEMAKE_append_mx7 = " ARCH=arm"
