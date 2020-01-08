require swupdate.inc

SRCREV = "e83730c4ec30134cdf56a2fd1d62a3767ade8133"

do_install_append () {
    # Rename the binaries installed by make install
    test -f ${D}${bindir}/progress && mv ${D}${bindir}/progress ${D}${bindir}/swupdate-progress
    test -f ${D}${bindir}/client && mv ${D}${bindir}/client ${D}${bindir}/swupdate-client
    test -f ${D}${bindir}/hawkbitcfg && mv ${D}${bindir}/hawkbitcfg ${D}${bindir}/swupdate-hawkbitcfg
    test -f ${D}${bindir}/sendtohawkbit && mv ${D}${bindir}/sendtohawkbit ${D}${bindir}/swupdate-sendtohawkbit
}