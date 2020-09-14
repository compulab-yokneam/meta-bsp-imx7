require linux-compulab_${PV}.bb

SUMMARY = "CompuLab ${PV} kernel with PREEMPT_RT patch "
DESCRIPTION = "Linux kernel with PREEMPT_RT patch for CompuLab imx7 boards."
FILESEXTRAPATHS_prepend := "${THISDIR}/linux-compulab-${PV}/${MACHINE}:"

include linux-compulab-${PV}/${PN}_${MACHINE}.inc

LOCALVERSION = "-cl-4.0-rt"
COMPATIBLE_MACHINE = "cl-som-imx7"
