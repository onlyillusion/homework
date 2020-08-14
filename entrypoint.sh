#!/bin/bash

sed -i "/HELLO WORLD/ s/$/ $APP_ENV/" /usr/share/nginx/html/index.html
echo "Starting nginx"
nginx -g 'daemon off;'
