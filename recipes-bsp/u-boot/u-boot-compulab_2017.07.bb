require recipes-bsp/u-boot/u-boot.inc

include u-boot-compulab.inc 

SECTION = "bootloader"
PROVIDES += "u-boot"
