package org.moldyfig.widgets;

public class WidgetConsumer {

    private String name;
    private WidgetProducer producer;

    public WidgetConsumer() {
    }

    public WidgetConsumer(String name) {
        if (name != null) {
            setName(name);
        }

        producer = new WidgetProducer();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String consume() {

        int processed = 0;

        // Assume WidgetProducer implements Iterable
        Iterator<Widget> it = producer.iterator();
        while (it.hasNext()) {
            Widget widget = it.next();
            boolean success = widget.process();
            if (success) {
                processed++;
            }
        }

        return String.format("Processed %d widgets", processed);
    }

    public toString() {
        return getName();
    }
}

