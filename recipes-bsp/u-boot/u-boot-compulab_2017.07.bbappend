FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_cl-som-imx7 +=  "\
    file://0999-cl-som-imx7_gg.patch \
"
