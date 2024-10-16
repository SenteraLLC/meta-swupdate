require swupdate.inc

SRCREV = "954e8c0b0f24fdd8f17ae7d382ff96622b95111a"

do_install:append () {
    # Rename the binaries installed by make install
    test -f ${D}${bindir}/progress && mv ${D}${bindir}/progress ${D}${bindir}/swupdate-progress
    test -f ${D}${bindir}/client && mv ${D}${bindir}/client ${D}${bindir}/swupdate-client
    test -f ${D}${bindir}/hawkbitcfg && mv ${D}${bindir}/hawkbitcfg ${D}${bindir}/swupdate-hawkbitcfg
    test -f ${D}${bindir}/sendtohawkbit && mv ${D}${bindir}/sendtohawkbit ${D}${bindir}/swupdate-sendtohawkbit
}
