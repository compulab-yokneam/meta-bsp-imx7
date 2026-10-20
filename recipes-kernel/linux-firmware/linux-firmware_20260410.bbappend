# meta-imx removes imx/sdma in favour of firmware-imx, leaving its empty
# parent unowned. Run after all do_install appends and preserve other firmware.
cleanup_empty_imx_firmware_dir() {
    if [ -d "${D}${nonarch_base_libdir}/firmware/imx" ]; then
        rmdir --ignore-fail-on-non-empty "${D}${nonarch_base_libdir}/firmware/imx"
    fi
}

do_install[postfuncs] += "cleanup_empty_imx_firmware_dir"
