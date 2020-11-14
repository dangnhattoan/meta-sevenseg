LINUX_VERSION ?= "4.19.71"
LINUX_RPI_BRANCH ?= "rpi-4.19.y-rt"

SRCREV = "e2e9cec6fb061ba58304fd391ef76747f2963557"

COMPATIBLE_MACHINE = "sevenseg"

KBUILD_DEFCONFIG_sevenseg ?= "bcm2711_defconfig"

require recipes-kernel/linux/linux-raspberrypi_4.19.inc
