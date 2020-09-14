MAINTAINER = "CompuLab <compulab@compulab.co.il>"
LICENSE = "GPLv2"

KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/linux-imx.git;protocol=https"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

DEPENDS += "lzop-native bc-native"

DEFAULT_PREFERENCE = "1"

do_deploy_append() {
	deployDir="${DEPLOYDIR}"
	tar -cvzf $deployDir/kernel-devicetree-${MODULE_TARBALL_NAME}.tgz -C ${KERNEL_OUTPUT_DIR}/dts ${KERNEL_DEVICETREE}
}
