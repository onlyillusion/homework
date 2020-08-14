FROM nginx
# arg for starting docker with -e APP_ENV=xxx
ARG APP_ENV
# Copy nginx config
COPY nginx.conf /etc/nginx/nginx.conf
COPY index.html  /usr/share/nginx/html
# Copy sh script
COPY entrypoint.sh entrypoint.sh

CMD ["bash", "entrypoint.sh"]
