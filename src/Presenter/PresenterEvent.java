package Presenter;

import java.util.HashMap;

/**
 * An event from a component that the presenter must handle.
 */

public class PresenterEvent {

    private static int nextEventID = 0;

    private HashMap<String, Integer> attributes;
    private int eventID;
    private String name;


    /**
     * Gets the name of the event
     *
     * @return The name of the event
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the ID of the presenter event
     *
     * @return The ID of the event
     */
    public long getEventID() {
        return eventID;
    }

    /**
     * Retrieves the value of a given attribute of this event
     *
     * @param attributeName The name of the attribute
     * @return The value associated with the attribute if one exists; {@code null} otherwise
     */
    public Object getAttributeValue(String attributeName) {
        return attributes.get(attributeName);
    }

}
