# Linaro toolchain how to

* Downlaod the Linaro compiler:
<pre>
cd ~/Downloads
wget https://releases.linaro.org/components/toolchain/binaries/latest-7/arm-linux-gnueabihf/gcc-linaro-7.5.0-2019.12-x86_64_arm-linux-gnueabihf.tar.xz
</pre>

* Install it:
<pre>
sudo tar -C /opt -xf ~/Downloads/gcc-linaro-7.5.0-2019.12-x86_64_arm-linux-gnueabihf.tar.xz
</pre>

* Set environment variables:
<pre>
export ARCH=arm
export CROSS_COMPILE=/opt/gcc-linaro-7.5.0-2019.12-x86_64_arm-linux-gnueabihf/bin/arm-linux-gnueabihf-
</pre>

* Get the compiler version information.<br>Make sure that the compiler installed and the environment set correctly, issue:
<pre>
${CROSS_COMPILE}gcc --version

arm-linux-gnueabihf-gcc (Linaro GCC 7.5-2019.12) 7.5.0
Copyright (C) 2017 Free Software Foundation, Inc.
This is free software; see the source for copying conditions.  There is NO
warranty; not even for MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
</pre>
