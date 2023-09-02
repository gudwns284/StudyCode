package newBook;

public class Book {
        private String name;
        private boolean isBorrowed;

        public Book(String name) {
            this.name = name;
            this.isBorrowed = false;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isBorrowed() {
            return this.isBorrowed;
        }

        public void setBorrowed(boolean isBorrowed) {
            this.isBorrowed = isBorrowed;
        }
}
