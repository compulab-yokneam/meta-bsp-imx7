FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append += "file://99-calibration.conf"

do_install_append () {
    install -d ${D}/${datadir}/X11/xorg.conf.d/
    install -m 0644 99-calibration.conf ${D}/${datadir}/X11/xorg.conf.d/
}

FILES_${PN} += "${datadir}/X11/xorg.conf.d/"
