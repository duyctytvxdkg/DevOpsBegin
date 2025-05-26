FROM nginx:alpine
COPY index.html /usr/share/nginx/html/index.html
COPY config.json /usr/share/nginx/html/config.json
