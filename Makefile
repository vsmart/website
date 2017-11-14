build:
	boot markdown render -r site.core/page target

serve:
	boot serve -r public watch markdown render -r site.core/page

deploy:
	scp -r target/public/* $(website_host)
