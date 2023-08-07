SOC_FAMILY = "mx7:mx7d"
MACHINEOVERRIDES =. "mx7:mx7d:"

require conf/machine/include/imx-base.inc
require conf/machine/include/arm/armv7a/tune-cortexa7.inc

IMX_DEFAULT_BSP = "nxp"

UBOOT_CONFIG ??= "sd"
UBOOT_CONFIG[sd] = "cl-som-imx7_defconfig,sdcard"

KERNEL_DEVICETREE += " \
	imx7d-cl-som-imx7.dtb \
	imx7d-sbc-imx7.dtb \
	imx7d-sbc-imx7-m4.dtb \
	imx7d-sbc-imx7-lvds.dtb \
	imx7d-sbc-iot-imx7.dtb \
	imx7d-sbc-iot-imx7-rs485-hdx.dtb \
	imx7d-sbc-iot-imx7-can.dtb \
"

IMAGE_BOOT_FILES = "zImage "
IMAGE_BOOT_FILES += " ${KERNEL_DEVICETREE} "

MACHINE_FEATURES += " alsa bluetooth serial usbhost wifi pci "

MACHINE_FIRMWARE = "linux-firmware-wl18xx \
			linux-firmware-iwlwifi-6000g2a-5 linux-firmware-iwlwifi-6000g2a-6 \
			linux-firmware-iwlwifi-6000g2b-5 linux-firmware-iwlwifi-6000g2b-6"


# Set Serial console
SERIAL_CONSOLE = "115200 ttymxc0"

IMAGE_INSTALL:append = " \
	kernel-image \
	kernel-modules \
	kernel-devicetree \
"
