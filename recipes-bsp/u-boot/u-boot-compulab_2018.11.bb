DESCRIPTION = "CompuLab cl-som-imx7 U-Boot"

require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "https://github.com/compulab/u-boot/archive/v2018.11-cl-som-imx7-hab-1.1.tar.gz"
SRC_URI[md5sum] = "deb5f76989c00f2aa92c0368cc157773"
SRC_URI[sha256sum] = "eb39401e0e7d467cd4c20a4afb67d973cfb9d99673fe5570cb404b2b8d18a98b"

include u-boot-compulab-2018.11/u-boot-compulab_cl-som-imx7.inc

S = "${WORKDIR}/u-boot-2018.11-cl-som-imx7-hab-1.1"

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE_cl-som-imx7 = "cl-som-imx7"
SECTION = "bootloader"
PROVIDES += "u-boot"
