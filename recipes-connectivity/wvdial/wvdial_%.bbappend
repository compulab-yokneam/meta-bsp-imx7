FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

FILES_${PN}-compulab += "\
    opt/compulab/wvdial/* \
"

SRC_URI_append += " \
	file://wvdial.conf \
	file://wvdial.sh \
"
do_install_append() {
    install -d ${D}/opt/compulab/wvdial
    install -m 0644 ${S}/../wvdial.conf ${D}/opt/compulab/wvdial/
    install -m 0755 ${S}/../wvdial.sh ${D}/opt/compulab/wvdial/
}

PACKAGES =+ "${PN}-compulab"
RDEPENDS_${PN}-compulab = "wvdial bash"
