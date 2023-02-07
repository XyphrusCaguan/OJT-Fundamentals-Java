class MemorableQuote {
    public String quoteText;
    public String reference;

    public MemorableQuote(String quoteText) {
        this.quoteText = quoteText;
    }

    public MemorableQuote(String quoteText, String reference) {
        this.quoteText = quoteText;
        this.reference = reference;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void printQuote() {
        if (reference == null) {
            System.out.println(quoteText);
        } else {
            System.out.println(quoteText + "\n-- " + reference);
        }
    }

    public boolean matches(String text) {
        String lowerCaseText = text.toLowerCase();
        String lowerCaseQuoteText = quoteText.toLowerCase();
        String lowerCaseReference = reference == null ? null : reference.toLowerCase();

        return lowerCaseQuoteText.contains(lowerCaseText) ||
               (lowerCaseReference != null && lowerCaseReference.contains(lowerCaseText));
    }
}


