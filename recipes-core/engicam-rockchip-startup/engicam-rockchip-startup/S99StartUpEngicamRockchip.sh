echo "###Engicam Rockchip Startup###"

rmmod panfrost
rmmod mali_kbase
modprobe mali_kbase
/etc/init.d/weston start
