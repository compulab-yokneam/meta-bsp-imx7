do_install_append () {
    rm -rf ${D}/${sysconfdir}/dbus-1/system.d/*.conf

    [ ${DISTRO_CODENAME} = warrior ] && exit 0

    if [ -f ${D}${sysconfdir}/wpa_supplicant.conf ];then
        # stat ${D}${sysconfdir}/wpa_supplicant.conf
        sed -i '/ctrl_interface=/ a p2p_disabled=1' ${D}${sysconfdir}/wpa_supplicant.conf
    fi
}
