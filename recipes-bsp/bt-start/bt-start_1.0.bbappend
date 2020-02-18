FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "\
    file://bt-start.imx7 \
    file://bt-start.service.imx7 \
"

S = "${WORKDIR}"

install_bt_start() {
    mv ${S}/bt-start.imx7 ${S}/bt-start
    mv ${S}/bt-start.service.imx7 ${S}/bt-start.service
}

do_install_prepend_cl-som-imx7() {
    install_bt_start
}

SYSTEMD_SERVICE_${PN} = "bt-start.service"
RDEPENDS_${PN} += "rfkill bluez5"
