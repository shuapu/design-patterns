package Creational.Builder;

public class Url {
    public String protocol;
    public String host;
    public int port;
    public String pathParameters;
    public String queryParameters;

    public static class UrlBuilder {
        public String protocol;
        public String host;
        public int port;
        public String pathParameters;
        public String queryParameters;

        public UrlBuilder setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public UrlBuilder setHost(String host) {
            this.host = host;
            return this;
        }

        public UrlBuilder setPort(int port) {
            this.port = port;
            return this;
        }

        public UrlBuilder setPathParameters(String pathParameters) {
            this.pathParameters = pathParameters;
            return this;

        }

        public UrlBuilder setQueryParameters(String queryParameters) {
            this.queryParameters = queryParameters;
            return this;
        }

        public Url build() {
            return new Url(this);
        }

    }

    private Url(UrlBuilder builder) {
        this.protocol=builder.protocol;
        this.host = builder.host;
        this.port = builder.port;
        this.pathParameters = builder.pathParameters;
        this.queryParameters = builder.queryParameters;
    }

    @Override
    public String toString() {
        return String.format("%s//%s:%d/%s?%s",protocol, host, port, pathParameters, queryParameters);
    }
}
