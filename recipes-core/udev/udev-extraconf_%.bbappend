FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append += "file://98-touchscreen-cal.rules"

do_install_append () {
    install -d ${D}${sysconfdir}/udev/rules.d/
    install -m 0644 98-touchscreen-cal.rules ${D}${sysconfdir}/udev/rules.d/
}

FILES_${PN} += "${sysconfdir}/udev/rules.d/"
