require recipes-core/images/core-image-minimal.bb

DESCRIPTION = "An image capable of allowing a raspberrypi4 to boot and suitable for development work."

IMAGE_INSTALL += " \
	kernel-modules \
	mod-noclue \
	"

SPLASH = "psplash-raspberrypi"

IMAGE_FEATURES += "dev-pkgs ssh-server-dropbear splash"

IMAGE_INSTALL_append = " bc"

ENABLE_UART = "1"
