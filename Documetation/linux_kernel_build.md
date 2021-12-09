# CL-SOM-iMX7 Linux Kernel Building

Supported machines:

* `cl-som-imx7`

## Prerequisites
It is up to developer to setup arm build environment:
* Download a tool chain from [Linaro](https://releases.linaro.org/components/toolchain/binaries/latest-7/arm-linux-gnueabihf/)
* Set environment variables:
<pre>
export ARCH=arm
export CROSS_COMPILE=/usr/bin/arm-linux-gnueabihf-
</pre>
* Create a folder to organize the files:
<pre>
mkdir cl-som-imx7
cd cl-som-imx7
</pre>
* Download CompuLab BSP
<pre>
git clone -b gatesgarth https://github.com/compulab-yokneam/meta-bsp-imx7.git
export PATCHES=$(pwd)/meta-bsp-imx7/recipes-kernel/linux/compulab/imx7
</pre>

# CompuLab Linux Kernel setup
<pre>
git clone https://source.codeaurora.org/external/imx/linux-imx.git
git -C linux-imx checkout -b linux-compulab lf-5.10.y-1.0.0
git -C linux-imx am ${PATCHES}/*.patch
</pre>

# Compile the Kernel
<pre>
make -C linux-imx compulab_imx7_defconfig
make -C linux-imx
</pre>
