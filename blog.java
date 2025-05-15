interface IBaseUser {
    void viewPost(String post);
}

interface IEditorUser extends IBaseUser {
    void editPost(String post);
}

interface IAdminUser extends IEditorUser {
    void blockPost(String post);
}

class Reader implements IBaseUser {
    public void viewPost(String post) {
        System.out.println("Reader is viewing: " + post);
    }
}

class Writer implements IEditorUser {
    public void viewPost(String post) {
        System.out.println("Writer is viewing: " + post);
    }

    public void editPost(String post) {
        System.out.println("Writer is editing: " + post);
    }
}

class Admin implements IAdminUser {
    public void viewPost(String post) {
        System.out.println("Admin is viewing: " + post);
    }

    public void editPost(String post) {
        System.out.println("Admin is editing: " + post);
    }

    public void blockPost(String post) {
        System.out.println("Admin is blocking: " + post);
    }
}

public class blog {
    public static void main(String[] args) {
        IBaseUser reader = new Reader();
        reader.viewPost("Intro to Java");

        IEditorUser writer = new Writer();
        writer.viewPost("SOLID Principles");
        writer.editPost("Advanced SOLID Concepts");

        IAdminUser admin = new Admin();
        admin.viewPost("Site Guidelines");
        admin.editPost("Updated Guidelines");
        admin.blockPost("Inappropriate Content");
    }
}
