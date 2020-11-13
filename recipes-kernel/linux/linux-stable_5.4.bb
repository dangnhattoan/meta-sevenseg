LINUX_VERSION ?= "5.4.72"
LINUX_RPI_BRANCH ?= "rpi-5.4.y"

SRCREV_sevenseg = "154de7bbd5844a824a635d4f9e3f773c15c6ce11"
SRCREV_meta = "5d52d9eea95fa09d404053360c2351b2b91b323b"

COMPATIBLE_MACHINE = "sevenseg"

KBUILD_DEFCONFIG_sevenseg ?= "bcm2711_defconfig"

require recipes-kernel/linux/linux-raspberrypi_5.4.inc
