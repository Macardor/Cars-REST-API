
    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )
create sequence hibernate_sequence start 1 increment 1

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id float4 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id float4 not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id float4 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  serial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id int8 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id int8 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id int8 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id int8 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id int8 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id int8 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id int8 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id int8 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id int8 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id int8 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id int8 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id int8 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id int8 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id int8 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id int8 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id int8 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id int8 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id int8 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id int8 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id int8 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id int8 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id int8 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       cars_id int8 not null,
        engines_id int8 not null,
        primary key (cars_id, engines_id)
    )

    create table Car_Wheel (
       cars_id int8 not null,
        wheels_id int8 not null,
        primary key (cars_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FKthsbi1s4jpnmck0vqs47ahw6m 
       foreign key (cars_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FK113a8470k5us20iokh4yoo1eo 
       foreign key (cars_id) 
       references Car

    create table Car (
       id  bigserial not null,
        brand varchar(255),
        fuelUsage float4 not null,
        mass float4 not null,
        primary key (id)
    )

    create table Car_Engine (
       Car_id int8 not null,
        engines_id int8 not null,
        primary key (Car_id, engines_id)
    )

    create table Car_Wheel (
       Car_id int8 not null,
        wheels_id int8 not null,
        primary key (Car_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FK9j06w1iu0v683xjgb3c7n1ku5 
       foreign key (Car_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FKf8v411jurh1en05rd179xpsjv 
       foreign key (Car_id) 
       references Car

    create table Car (
       id  bigserial not null,
        body varchar(255),
        brand varchar(255),
        emmision float4 not null,
        fuelUsage float4 not null,
        mass float4 not null,
        model varchar(255),
        year int4 not null,
        primary key (id)
    )

    create table Car_Engine (
       Car_id int8 not null,
        engines_id int8 not null,
        primary key (Car_id, engines_id)
    )

    create table Car_Wheel (
       Car_id int8 not null,
        wheels_id int8 not null,
        primary key (Car_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        name varchar(255),
        power float4 not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        tire varchar(255),
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FK9j06w1iu0v683xjgb3c7n1ku5 
       foreign key (Car_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FKf8v411jurh1en05rd179xpsjv 
       foreign key (Car_id) 
       references Car

    create table Car (
       id  bigserial not null,
        body varchar(255),
        brand varchar(255),
        mass float4 not null,
        model varchar(255),
        year int4 not null,
        primary key (id)
    )

    create table Car_Engine (
       Car_id int8 not null,
        engines_id int8 not null,
        primary key (Car_id, engines_id)
    )

    create table Car_Wheel (
       Car_id int8 not null,
        wheels_id int8 not null,
        primary key (Car_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        emmision float4 not null,
        fuelUsage float4 not null,
        name varchar(255),
        power float4 not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        tire varchar(255),
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FK9j06w1iu0v683xjgb3c7n1ku5 
       foreign key (Car_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FKf8v411jurh1en05rd179xpsjv 
       foreign key (Car_id) 
       references Car

    create table Car (
       id  bigserial not null,
        body varchar(255),
        brand varchar(255),
        mass float4 not null,
        model varchar(255),
        year int4 not null,
        primary key (id)
    )

    create table Car_Engine (
       Car_id int8 not null,
        engines_id int8 not null,
        primary key (Car_id, engines_id)
    )

    create table Car_Wheel (
       Car_id int8 not null,
        wheels_id int8 not null,
        primary key (Car_id, wheels_id)
    )

    create table Engine (
       id  bigserial not null,
        emmision float4 not null,
        fuelUsage float4 not null,
        name varchar(255),
        power float4 not null,
        torque float4 not null,
        volume float4 not null,
        primary key (id)
    )

    create table Wheel (
       id  bigserial not null,
        diameter float4 not null,
        tire varchar(255),
        width float4 not null,
        primary key (id)
    )

    alter table if exists Car_Engine 
       add constraint FK70en9lfo5ocshv9schsbwob0g 
       foreign key (engines_id) 
       references Engine

    alter table if exists Car_Engine 
       add constraint FK9j06w1iu0v683xjgb3c7n1ku5 
       foreign key (Car_id) 
       references Car

    alter table if exists Car_Wheel 
       add constraint FKr0uf6rvfq4a5e2viiyff7r1ms 
       foreign key (wheels_id) 
       references Wheel

    alter table if exists Car_Wheel 
       add constraint FKf8v411jurh1en05rd179xpsjv 
       foreign key (Car_id) 
       references Car
