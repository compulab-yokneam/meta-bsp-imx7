LICENSE = "GPLv2"

KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/linux-imx.git;protocol=https"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

DEPENDS += "lzop-native bc-native"

DEFAULT_PREFERENCE = "1"
