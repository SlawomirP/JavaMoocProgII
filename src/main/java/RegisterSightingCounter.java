import java.util.HashMap;

public class RegisterSightingCounter {
        private HashMap<String, Integer> allSightings;

        public RegisterSightingCounter() {
            this.allSightings = new HashMap<>();
        }

        public void addSighting(String sighted) {
            if (!this.allSightings.containsKey(sighted)) {
                this.allSightings.put(sighted, 0);
            }

            int timesSighted = this.allSightings.get(sighted);
            timesSighted++;
            this.allSightings.put(sighted, timesSighted);
        }

        public int timesSighted(String sighted) {
            return this.allSightings.get(sighted);
        }
    }

