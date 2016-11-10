package ua.kiev.prog.entity;

public enum UserRole {
    ADMIN,
    COURIER,
    MANAGER;

    @Override
    public String toString() {
        return "ROLE_" + name();
    }
}
