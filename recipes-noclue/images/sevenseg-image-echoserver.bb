require recipes-core/images/core-image-minimal.bb

DESCRIPTION = "A small image just capable of running simpleechoserver"

SPLASH = "psplash-raspberrypi"

IMAGE_FEATURES_append = "\
			 dev-pkgs \
			 splash \
			 ssh-server-dropbear \
			"

IMAGE_INSTALL_append = " simpleechoserver \
			 screen \
			 mod-noclue \
			 kernel-module-praseodymium \
		       "
