do_install_append () {
    if [ -f ${D}/${datadir}/X11/xorg.conf.d/40-libinput.conf ];then
        rm -rf ${D}/${datadir}/X11/xorg.conf.d/40-libinput.conf
    fi
}
