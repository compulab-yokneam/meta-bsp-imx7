FILESEXTRAPATHS_prepend := "${THISDIR}/u-boot-compulab-2017.07:${THISDIR}/${PN}:"

include u-boot-compulab.inc 
include u-boot-fw-utils.inc

SECTION = "bootloader"
PROVIDES += "u-boot-fw-utils"
