SRC_URI_append_cl-som-imx7 += "\
    file://0001-ARM-dts-imx7d-cl-som-imx7-fix-uart1-parent-clock.patch \
    file://0002-ARM-dts-imx7d-cl-som-imx7-fix-i2c2-configuration.patch \
    file://0003-ARM-dts-imx7d-cl-som-imx7-add-fec-phy-reset.patch \
    file://0004-ARM-dts-imx7d-cl-som-imx7-add-RTC-support.patch \
    file://0005-ARM-dts-imx7d-cl-som-imx7-add-support-for-gpio-led.patch \
    file://0006-ARM-dts-imx7d-cl-som-imx7-add-support-for-touchscree.patch \
    file://0007-ARM-dts-imx7d-cl-som-imx7-add-support-for-SPI-flash.patch \
    file://0008-ARM-dts-imx7d-cl-som-imx7-add-support-for-USB-host.patch \
    file://0009-ARM-dts-imx7d-cl-som-imx7-add-support-for-USB-hub.patch \
    file://0010-ARM-dts-imx7d-cl-som-imx7-add-support-for-watchdog.patch \
    file://0011-ARM-dts-imx7d-cl-som-imx7-add-support-for-NAND-flash.patch \
    file://0012-ARM-dts-imx7d-cl-som-imx7-add-WiLink8-WLAN-support.patch \
    file://0013-regulator-userspace-consumer-add-MODULE_ALIAS-macro.patch \
    file://0014-regulator-add-userspace-consumer-wrapper-driver.patch \
    file://0015-ARM-dts-imx7d-cl-som-imx7-add-WiLink-Bluetooth-suppo.patch \
    file://0016-ARM-imx7d-cl-som-imx7-Bluetooth-control-with-regulat.patch \
    file://0017-ASoC-fsl-add-analog-audio-support-switch-for-imx-boa.patch \
    file://0018-ARM-dts-imx7d-cl-som-imx7-add-analog-audio-support.patch \
    file://0019-ARM-dts-imx7d-sbc-imx7-update-model-string.patch \
    file://0020-ARM-dts-imx7d-sbc-imx7-add-support-for-pwm-backlight.patch \
    file://0021-ARM-dts-imx7d-sbc-imx7-add-gpio-extender-support.patch \
    file://0022-ARM-dts-imx7d-sbc-imx7-add-support-for-baseboard-eep.patch \
    file://0023-ARM-dts-imx7d-sbc-imx7-add-LCD-support.patch \
    file://0024-ARM-dts-imx7d-sbc-imx7-add-DVI-support.patch \
    file://0025-ARM-dts-imx7d-sbc-imx7-add-CAN-bus-support.patch \
    file://0026-PCIe-imx6-imx7d-add-support-for-phy-refclk-source-co.patch \
    file://0027-ARM-dts-imx7d-sbc-imx7-enable-PCIe.patch \
    file://0028-ARM-dts-imx7d-sbc-iot-imx7-add-basic-board-support.patch \
    file://0029-ARM-dts-imx7d-sbc-iot-imx7-add-support-for-CAN-bus.patch \
    file://0030-serial-imx-allow-passing-rs485-options.patch \
    file://0031-ARM-imx7d-clk-select-uart7-clock-parent-and-set-rate.patch \
    file://0032-ARM-dts-imx7d-sbc-iot-imx7-add-support-for-RS485-in-.patch \
    file://0033-ARM-dts-imx7d-sbc-imx7-add-support-for-m4.patch \
    file://0034-MLK-11395-9-video-mipi_dsi_samsung-add-MIPI-host-sid.patch \
    file://0035-video-mipi-panel-ti-sn65dsi83-add-MIPI-LVDS-bridge-d.patch \
    file://0036-ARM-imx7d-cl-som-imx7-dts-add-LVDS-support.patch \
    file://0037-ARM-configs-add-defconfig-for-compulab-imx7-based-de.patch \
    file://0038-ARM-dts-imx7d-sbc-imx7-enable-SB-SOM-peripheral.patch \
    file://0039-rtc-em3027-correct-month-value.patch \
    file://0040-ARM-imx7d-release-kernel-v4.14.98-cl-som-imx7-6.0.patch \
    file://0041-ARM-dts-imx7d-cl-som-imx7-disable-unsupported-operat.patch \
    file://0042-mtd-tests-nandecctest-add-dummy-module-parameter.patch \
    file://0043-ARM-configs-update-compulab_imx7_defconfig.patch \
    file://0044-ARM-imx7d-release-kernel-v4.14.98-cl-som-imx7-6.1.patch \
    file://0045-ARM-dts-imx7d-sbc-imx-add-support-for-spidev.patch \
    file://0046-ARM-configs-add-Moby-compatible-defconfig-for-compul.patch \
    file://0047-Revert-ARM-imx7d-cl-som-imx7-Bluetooth-control-with-.patch \
    file://0048-ARM-dts-imx7d-cl-som-imx7-rework-WiLink-Bluetooth-su.patch \
    file://0049-ARM-imx7d-release-kernel-v4.14.98-cl-som-imx7-6.2.patch \
    file://0050-ARM-config-compulab-update-defconfig.patch \
    file://0051-ARM-config-compulab-update-Moby-defconfig.patch \
    file://0052-ARM-imx7d-release-kernel-v4.14.98-cl-som-imx7-6.3.patch \
    file://0053-ARM-dts-imx7d-sbc-imx7-enable-adc1.patch \
    file://0054-ARM-dts-imx7d-cl-som-imx7-rework-USB-hub-reset.patch \
    file://0055-ARM-dts-imx7d-sbc-imx7-sbc-iot-imx7-fix-pinctrl-0-li.patch \
    file://defconfig \
"

DEFAULT_DEFCONFIG = "compulab_imx7"

do_configure_append () {
    oe_runmake ${DEFAULT_DEFCONFIG}_defconfig
}
