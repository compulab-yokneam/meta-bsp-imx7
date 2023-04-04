#!/bin/sh

# Prepare NXP BSP
## Initialize repo
repo init -u https://github.com/nxp-imx/imx-manifest -b imx-linux-warrior -m imx-4.19.35-1.1.0.xml
## Download and apply patch
mkdir -p ./patches
wget --directory-prefix ./patches https://raw.githubusercontent.com/compulab-yokneam/meta-bsp-imx7/warrior/tools/imx-linux-warrior.patch
patch -p1 < ./patches/imx-linux-warrior.patch
## Fetch NXP BSP
repo sync
# Download CompuLab meta layer
git clone -b warrior https://github.com/compulab-yokneam/meta-bsp-imx7.git sources/meta-bsp-imx7/

