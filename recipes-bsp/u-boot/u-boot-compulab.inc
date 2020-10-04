DESCRIPTION = "u-boot which includes support for CompuLab boards."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"

SRCBRANCH = "master"
SRCREV = "v2017.07"
SRC_URI = "git://gitlab.denx.de/u-boot/u-boot.git;branch=${SRCBRANCH};protocol=https"

include u-boot-compulab-2017.07/u-boot-compulab_cl-som-imx7.inc

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE_cl-som-imx7 = "cl-som-imx7"
