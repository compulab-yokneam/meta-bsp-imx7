inherit allarch

# Fix linux-firmware version number conversion for debian package manager
PV = "1.0"

do_install_append() {
	rm -r ${D}${nonarch_base_libdir}/firmware/netronome/
}

FILES_${PN}_remove = "${nonarch_base_libdir}/firmware/netronome"
