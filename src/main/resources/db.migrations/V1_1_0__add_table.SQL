-- Criação da tabela Databases
CREATE TABLE Databases
(
    DatabaseID INT PRIMARY KEY IDENTITY(1,1),
    Name       NVARCHAR(255) NOT NULL,
    IsActive   BIT NOT NULL DEFAULT 1,
    UserCreate NVARCHAR(255),
    UserEdit   NVARCHAR(255),
    DateCreate DATETIME,
    DateEdit   DATETIME
);
CREATE INDEX idx_databases_name ON Databases (Name);

-- Criação da tabela ReportStructure
CREATE TABLE ReportStructure
(
    ID             INT PRIMARY KEY IDENTITY(1,1),
    DatabaseId     INT NOT NULL,
    TableName      NVARCHAR(255) NOT NULL,
    UpdatePriority INT,
    UserCreate     NVARCHAR(255),
    UserEdit       NVARCHAR(255),
    DateCreate     DATETIME,
    DateEdit       DATETIME,
    FOREIGN KEY (DatabaseId) REFERENCES Databases (DatabaseID)
);
CREATE INDEX idx_reportstructure_databaseid ON ReportStructure (DatabaseId);

-- Criação da tabela MenuItems
CREATE TABLE MenuItems
(
    Id           INT PRIMARY KEY IDENTITY(1,1),
    ParentId     INT NULL,
    Name         NVARCHAR(255) NOT NULL,
    Level        INT NOT NULL,
    DisplayOrder INT NOT NULL,
    IsReport     BIT NOT NULL DEFAULT 1,
    IsActive     BIT NOT NULL DEFAULT 1,
    UserCreate   NVARCHAR(255),
    UserEdit     NVARCHAR(255),
    DateCreate   DATETIME,
    DateEdit     DATETIME,
    CONSTRAINT FK_MenuItems_ParentId FOREIGN KEY (ParentId) REFERENCES MenuItems (Id)
);

-- Criação da tabela Report
CREATE TABLE Report
(
    ID                INT PRIMARY KEY IDENTITY(1,1),
    MenuItemsId       INT NOT NULL,
    FilterId          INT,
    ReportStructureId INT NOT NULL,
    Name              NVARCHAR(255) NOT NULL,
    IsActivity        BIT NOT NULL DEFAULT 0,
    IsVisibility      BIT NOT NULL DEFAULT 1,
    PriorityLevel     INT NOT NULL,
    DisplayOrder      INT NOT NULL,
    IsExportExcel     BIT NOT NULL DEFAULT 1,
    Description       NVARCHAR(MAX),
    UserCreate        NVARCHAR(255),
    UserEdit          NVARCHAR(255),
    DateCreate        DATETIME,
    DateEdit          DATETIME,
    FOREIGN KEY (MenuItemsId) REFERENCES MenuItems (Id),
    FOREIGN KEY (ReportStructureId) REFERENCES ReportStructure (ID)
);
CREATE INDEX idx_report_menuitemsid ON Report (MenuItemsId);
CREATE INDEX idx_report_reportstructureid ON Report (ReportStructureId);

-- Criação da tabela Filter
CREATE TABLE Filter
(
    ID           INT PRIMARY KEY IDENTITY(1,1),
    ReportID     INT NOT NULL,
    Name         NVARCHAR(255) NOT NULL,
    Description  NVARCHAR(MAX),
    Position     INT,
    DefaultValue NVARCHAR(255),
    IsActive     BIT NOT NULL DEFAULT 0,
    IsInt        BIT NOT NULL DEFAULT 0,
    IsStartDate  BIT NOT NULL DEFAULT 0,
    IsEndDate    BIT NOT NULL DEFAULT 0,
    IsText       BIT NOT NULL DEFAULT 0,
    UserCreate   NVARCHAR(255),
    UserEdit     NVARCHAR(255),
    DateCreate   DATETIME,
    DateEdit   DATETIME,
    FOREIGN KEY (ReportID) REFERENCES Report (ID)
);
CREATE INDEX idx_filter_reportid ON Filter (ReportID);
