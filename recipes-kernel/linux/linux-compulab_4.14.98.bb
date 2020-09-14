SUMMARY = "CompuLab ${PV} kernel"
DESCRIPTION = "Linux kernel for CompuLab imx7 boards."

require recipes-kernel/linux/linux-imx.inc

include ${PN}_${PV}.inc
include linux-common.inc
include linux-compulab-${PV}/linux-compulab_${MACHINE}.inc

LOCALVERSION = "-cl-3.0"
COMPATIBLE_MACHINE = "cl-som-imx7"
