SUMMARY = "add default script startup"
DESCRIPTION = "This package provides to add the script startup"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${WORKDIR}/copyright;md5=3dd6192d306f582dee7687da3d8748ab"


SRC_URI = "file://S99StartUpEngicamRockchip.sh \
		   file://copyright"


do_install () {
	install -d ${D}${sysconfdir}
	install -d ${D}${sysconfdir}/rc5.d
	install -m 0755 ${WORKDIR}/S99StartUpEngicamRockchip.sh  ${D}${sysconfdir}/rc5.d/
}

FILES_${PN} = "/etc/rc5.d"


