FILESEXTRAPATHS_append := "${THISDIR}/u-boot-compulab:"

SRC_URI_append = " \
	file://0001-Update-cl-som-imx7.c.patch \
"

PR = "r1.9.1"
