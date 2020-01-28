do_install_append () {
	rm -rf ${D}/${sysconfdir}/dbus-1/system.d/*.conf
}
