inherit allarch

do_install_append() {
	rm -r ${D}${nonarch_base_libdir}/firmware/netronome/
}

FILES_${PN}_remove = "${nonarch_base_libdir}/firmware/netronome"
