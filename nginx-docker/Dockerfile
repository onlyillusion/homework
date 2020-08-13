FROM nginx

ARG APP_ENV
COPY nginx.conf /etc/nginx/nginx.conf
COPY index.html  /usr/share/nginx/html

COPY entrypoint.sh entrypoint.sh

CMD ["bash", "entrypoint.sh"]
