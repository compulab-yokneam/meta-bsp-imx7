SUMMARY = "CompuLab Linux Kernel for cl-som-imx7 SOM"

inherit kernel

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

S = "${WORKDIR}/git"

KCONFIG_MODE="--alldefconfig"

KERNEL_EXTRA_ARGS += "LOADADDR=${UBOOT_ENTRYPOINT}"

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "linux-compulab_v5.10.9"
SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/compulab-yokneam/linux-compulab;protocol=https;branch=${SRCBRANCH}"

LOCALVERSION = "-1.0.0"
LINUX_VERSION = "5.10.9"

DEFAULT_PREFERENCE = "1"

KBUILD_DEFCONFIG:cl-som-imx7 = "compulab_imx7_defconfig"

do_compile:prepend() {
    if [ ${BUILD_REPRODUCIBLE_BINARIES} -eq 1 ];then
        export SOURCE_DATE_EPOCH=$(date +%s)
    fi
}

COMPATIBLE_MACHINE = "cl-som-imx7"
