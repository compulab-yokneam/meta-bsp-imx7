PROVIDES = "u-boot-fw-utils"

SRC_URI =+ "file://fw_env.config"

do_compile_cl-som-imx7 () {
	oe_runmake ${UBOOT_MACHINE}
	oe_runmake env
}

do_install_append () {
	install -d ${D}${sysconfdir}/${MACHINE}
	install -m 0644 ${WORKDIR}/fw_env.config ${D}${sysconfdir}/${MACHINE}/fw_env.config
	ln -sf ${MACHINE}/fw_env.config ${D}${sysconfdir}/fw_env.config
}
